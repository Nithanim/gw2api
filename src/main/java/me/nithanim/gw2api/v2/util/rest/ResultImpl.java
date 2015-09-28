package me.nithanim.gw2api.v2.util.rest;

import com.sun.jersey.api.client.ClientResponse;
import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ResultImpl<T> implements PaginationResult<T> {
    private final ClientResponse clientResponse;
    private final Class<T> clazz;
    private T result;
    private int pageSize = -1;
    private int pageTotal = -1;
    private int resultCount = -1;
    private int resultTotal = -1;

    public ResultImpl(ClientResponse clientResponse, Class<T> clazz) {
        this.clientResponse = clientResponse;
        this.clazz = clazz;
    }

    @Override
    public T getResult() {
        if (result == null) {
            String json = clientResponse.getEntity(String.class);
            result = RequestHelper.jsonToObject(json, clazz);
        }
        return result;
    }

    @Override
    public int getPageSize() {
        if (pageSize == -1) {
            pageSize = Integer.parseInt(
                clientResponse.getHeaders().getFirst("X-Page-Size"));
        }
        return pageSize;
    }

    @Override
    public int getPageTotal() {
        if (pageTotal == -1) {
            pageTotal = Integer.parseInt(
                clientResponse.getHeaders().getFirst("X-Page-Total"));
        }
        return pageTotal;
    }

    @Override
    public int getResultCount() {
        if (resultCount == -1) {
            resultCount = Integer.parseInt(
                clientResponse.getHeaders().getFirst("X-Result-Count"));
        }
        return resultCount;
    }

    @Override
    public int getResultTotal() {
        if (resultTotal == -1) {
            resultTotal = Integer.parseInt(
                clientResponse.getHeaders().getFirst("X-Result-Total"));
        }
        return resultTotal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.clientResponse);
        hash = 17 * hash + Objects.hashCode(this.clazz);
        hash = 17 * hash + Objects.hashCode(this.result);
        hash = 17 * hash + this.pageSize;
        hash = 17 * hash + this.pageTotal;
        hash = 17 * hash + this.resultCount;
        hash = 17 * hash + this.resultTotal;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ResultImpl<?> other = (ResultImpl<?>) obj;
        return Objects.equals(this.clientResponse, other.clientResponse)
            && Objects.equals(this.clazz, other.clazz)
            && Objects.equals(this.getResult(), other.getResult())
            && this.getPageSize() == other.getPageSize()
            && this.getPageTotal() == other.getPageTotal()
            && this.getResultCount() == other.getResultCount()
            && this.getResultTotal() == other.getResultTotal();
    }

    @Override
    public String toString() {
        getResult();
        getPageSize();
        getPageTotal();
        getResultCount();
        getResultTotal();
        return ToStringBuilder.reflectionToString(this);
    }
}
